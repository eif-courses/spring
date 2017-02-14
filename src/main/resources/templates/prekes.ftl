<!DOCTYPE html>

<html lang="en">

<head>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script>

</head>
<body>






<table>
<tr>

<#assign colors = ['red', 'blue', 'yellow', 'green','grey', 'orange']
colors += colors
colors += colors
colors += colors


urlas=['http://www.foodnavigator-usa.com/var/plain_site/storage/images/galleries/food-beverage-nutrition/new-products-gallery-cinnamon-toast-crunch-turns-30-conagra-makes-snacking-guilt-free-kevita-s-kombucha-for-the-mainstream/life-choice-delight-bites-pack-whole-grain-punch/9302167-1-eng-GB/Life-Choice-Delight-Bites-pack-whole-grain-punch_dnm_gallery.jpg',
'http://www.healthysupplies.co.uk/pics/400x400/wheat-grain-pack-infinity.jpg', 'http://i5.walmartimages.ca/images/Large/110/936/110936.jpg', 'https://www.graphicsprings.com/filestorage/stencils/e8072d88733b94e335fb4a2d732f5ac7.svg']
urlas += urlas
urlas += urlas
urlas += urlas
urlas += urlas
urlas += urlas
>
<#list prekes as item>

    <#if item.id % 4 == 0 >
        <tr>
       </tr>
    </#if>





        <td>

            <a href="preke/${item.id}">
        <div class="card small">
            <img width="200px" height="200px" src="${urlas[item?index]}">
            <div>${item.pavadinimas}<a href="#!" class="secondary-content"><span class="new badge ${colors[item?index]}" data-badge-caption="${item.pavadinimas}">${item.id}</span></a></div>

        </div>
            </a>
        </td>






</#list>

    </tr>
</table>


</body>




</html>