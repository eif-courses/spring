<!DOCTYPE html>

<html lang="en">

<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script>

</head>
<body>



<h1>${preke.pavadinimas}</h1>


<table class="striped">
    <thead>
    <tr>
        <th data-field="id">Id</th>
        <th data-field="name">Pavadinimas</th>
        <th data-field="price">Kaina</th>
    </tr>
    </thead>

    <tbody>
    <tr>
        <td>${preke.id}</td>
        <td>${preke.pavadinimas}</td>
        <td>${preke.kaina}</td>
    </tr>


    </tbody>
</table>











</body>




</html>