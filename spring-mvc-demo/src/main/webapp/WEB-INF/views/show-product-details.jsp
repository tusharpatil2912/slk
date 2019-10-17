<%@ include file="./header.jsp"%>
<div class="container alert alert-primary">
<h4>${pr.name}</h4>
</div>
<div class="row">
	<div class="col">
		<img src="${pr.picture}" class="img img-thumbnail" alt="${pr.name}">
	</div>
	<div class="col">
		<table class="table">
			<tr>
				<th>Name</th>
				<td>${pr.name}</td>
			</tr>
			<tr>
				<th>Description</th>
				<td>${pr.description}</td>
			</tr>
			<tr>
				<th>Quantity per Unit</th>
				<td>${pr.quantityPerUnit}</td>
			</tr>
			<tr>
				<th>Unit Price</th>
				<td>INR. ${pr.unitPrice}</td>
			</tr>
			<tr>
				<th>Category</th>
				<td>${pr.category}</td>
			</tr>
			<tr>
				<th>Brand</th>
				<td>${pr.brand}</td>
			</tr>
			<tr>
				<th>Discount</th>
				<td>${pr.discount}</td>
			</tr>
		</table>
		<a href="./edit-product?id=${pr.id}" class="btn btn-primary">Edit</a>
		<a href="./delete-product?id=${pr.id}" class="btn btn-danger">Delete</a>
	</div>
</div>

<%@ include file="./footer.jsp"%>