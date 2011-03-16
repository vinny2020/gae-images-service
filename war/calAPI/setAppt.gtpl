<html>
<head>
  <title>Google Calender API demo</title>
  <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>

  <script   type="text/javascript" >
    jQuery(document).ready(function() {
      jQuery("#datepicker1").datepicker({ dateFormat: 'yy-mm-dd' });
      jQuery("#datepicker2").datepicker({ dateFormat: 'yy-mm-dd' });
    });
  </script>

</head>
<body style="font-size:62.5%;">
<h2>Enter your google account credentials to retrieve your calender feed</h2>
<form action="/gCalsetAppt.groovy" method="post">
 Username:  <input type="text" name="username"/> <br/>
 Password  <input type="password" name="password"/>  <br/>
Start  <input type="text" id="datepicker1" name="startTime" />    <br/>
End  <input type="text" id="datepicker2" name="endTime" />    <br/>
Title  <input type="text" name="title" /> <br/>
Details:   <input type="text" name="details" /> <br/>
Where   <input type="text" name="where" /> <br/>
  <input type="submit" value="Submit" />
</form>
</body>
</html>
