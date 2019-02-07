<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion();
  } );
  </script>
</head>
<body>
 
<div id="accordion">
  <h3>Abount me</h3>
  <div>
    <p>
    I am a Student!<br>
    <img src="006.png" width="150" height="150">
    </p>
  </div>
  <h3>My Hobby</h3>
  <div>
    <p>
    Run...Eat...<br>
    <img src="008.png" width="150" height="150">
    </p>
  </div>
  <h3>My Food</h3>
  <div>
    <p>
    Ramen, Sushi....<br>
    <img src="007.png" width="150" height="150">
    </p>
    <ul>
      <li>KimBob</li>
      <li>Kimchi</li>
      <li>Woodong</li>
    </ul>
  </div>
</div>
 
</body>
</html>