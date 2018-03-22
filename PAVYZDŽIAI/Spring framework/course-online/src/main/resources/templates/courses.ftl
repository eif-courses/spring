<!DOCTYPE html>

<html lang="en">

<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script>



</head>
<body>
<div class="card-panel">
    <span class="blue-text text-darken-2"><h3>Hello, ${account.fullName}!</h3><form><button class="btn waves-effect waves-light amber darken-3" type="submit" formmethod="post" formaction="/logout">Logout</button></form>
</span>
</div>



<br/>
<table class="striped">




            <#list courses as item>

                <tr>

                    <td>${item.name}</td>
                    <td>
                        <a class="btn waves-effect waves-light red" type="submit" name="action"  href="course\${item.id}">
                            View Course
                        </a>
                    </td>

                </tr>

            </#list>


</table>


</body>




</html>