<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Management System</title>
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport"
	content="width=device-width,initial-scale=1,max-scale=1,min-scale=1">
<script type="text/javascript" src="assets/js/jquery-3.4.1.js"></script>
<script>
	$(function() {
		$("a[href*=delete]").on("click", function(evt) {
			if (confirm('Hey, are you sure to delete?') === false) {
				evt.preventDefault();
			}
		})
	});
</script>
</head>

<body>
	<div class="alert alert-info">
		<h1 class="container">Product Management System</h1>
		<p class="lead container">Devloped by Tushar</p>
	</div>

	<div class="container">
		<div class="row" style="min-height: 400px">
			<div class="col-md-4 col-sm-3">
				<!-- Sidebar -->
				<a class="btn btn-block btn-primary" href="./">Home</a> <a
					class="btn btn-block btn-primary" href="./login">Login</a> <a
					class="btn btn-block btn-primary" href="./view-products">View
					Products</a> <a class="btn btn-block btn-primary"
					href="./add-new-product">Add New Product</a> <a
					class="btn btn-block btn-primary" href="./advanced-search">Advanced
					Search</a>
			</div>
			<div class="col-md-8 col-sm-9">