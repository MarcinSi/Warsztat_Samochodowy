<<<<<<< HEAD

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/addcustumorestyle.css">

    <title>Dodaj pracownika</title>
=======
<%--
  Created by IntelliJ IDEA.

  User: leszek
  Date: 01.08.18
  Time: 12:42

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie pracownika</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/formstyle.css">
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Dodaj pracownika</strong>
</div>
<form action="/addemployee" method="post">
<<<<<<< HEAD

=======
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
    <div class="form-group">
        <label for="formGroupInputFirstName">Imię</label>
        <input type="text" class="form-control" id="formGroupInputFirstName" name="name" placeholder="Imię" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputLastName">Nazwisko</label>
        <input type="text" class="form-control" id="formGroupInputLastName" name="lastName" placeholder="Nazwisko" required>
    </div>
    <div class="form-group">
<<<<<<< HEAD
        <label for="formGroupInputAddress">Adres zamieszkania</label>
        <input type="text" class="form-control" id="formGroupInputAddress" name="address" placeholder="Adres zamieszkania">
    </div>
    <div class="form-group">
        <label for="formGroupInputAddress">Notatka</label>

        <textarea id="formGroupInputNote" cols="140" rows="4" name="note" placeholder="Notatka"></textarea>
    </div>
    <div class="form-group">
        <label for="formGroupInputWorkingHourCost">Koszt roboczogodziny</label>
        <input type="number" class="form-control" id="formGroupInputworkingHourCost" name="workingHourCost" placeholder="Koszt roboczogodziny" min="0" step="0.01">
    </div>
    <button type="submit" class="btn btn-primary mb-2">Submit</button>
=======
        <label for="formGroupInputNote">Notatka</label>
        <input type="text" class="form-control" id="formGroupInputNote" name="note" placeholder="notatka">
    </div>
    <div class="form-group">
        <label for="formGroupInputWorkingHourCost">Koszt roboczo godziny</label>
        <input type="number" step="0.01" class="form-control" id="formGroupInputWorkingHourCost" name="workingHourCost" placeholder="koszt roboczo godziny" required>
    </div>
    <button type="submit" class="btn btn-primary mb-2">Prześlij</button>
>>>>>>> 43b94dc452a9e83f6daa61c87eb70e08d3f47ec3
</form>
</body>
</html>
