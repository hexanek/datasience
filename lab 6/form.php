<?php
$link = mysqli_connect("localhost", "root", "")
    or die("Could not connect");
mysqli_select_db($link, "obojetnieco")
    or die("Could not select database");
    $name = $_POST['Imie'];
$surname = $_POST['Nazwisko'];
$age = $_POST['Wiek'];
$query  = "INSERT INTO Wiek (Wiek,Imie,Nazwisko)
            VALUES ('$age','$name','$surname')";
    if ($link->query($query) === TRUE) {
        echo "New record created successfully";
    } else {
        echo "Error: " . $query . "<br>" . $link->error;
    }
mysqli_close($link);
?>