
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <!--TODO try to import bootstrap from maven-->
    <!--<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet"/>-->
    <link rel="stylesheet" href="style/addcustumorestyle.css">

    <title>Dodaj pracownika</title>
</head>
<body>
<div class="alert alert-success" role="alert">
    <strong>Dodaj pracownika</strong>
</div>
<form action="/addemployee" method="post">

    <div class="form-group">
        <label for="formGroupInputFirstName">Imię</label>
        <input type="text" class="form-control" id="formGroupInputFirstName" name="name" placeholder="Imię" required>
    </div>
    <div class="form-group">
        <label for="formGroupInputLastName">Nazwisko</label>
        <input type="text" class="form-control" id="formGroupInputLastName" name="lastName" placeholder="Nazwisko" required>
    </div>
    <div class="form-group">
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
</form>
</body>
</html>
