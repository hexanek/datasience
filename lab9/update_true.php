<?php
$link = mysqli_connect("localhost", "root", "")
    or die("Could not connect");
mysqli_select_db($link, "obojetnieco")
    or die("Could not select database");
    $name = $_POST['Imie'];
$surname = $_POST['Nazwisko'];
$age = $_POST['Wiek'];
$id = $_POST['ID'];
$query  = "UPDATE Wiek 
SET Wiek = '$age', Nazwisko = '$name', Imie = '$surname' WHERE ID = '$id'";
    if ($link->query($query) === TRUE) {
        echo "Rekord zaaktualizowany";
    } else {
        echo "Error: " . $query . "<br>" . $link->error;
    }
mysqli_close($link);
?>