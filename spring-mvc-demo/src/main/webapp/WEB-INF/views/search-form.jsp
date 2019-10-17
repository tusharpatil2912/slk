<%@ include file="./header.jsp"%>

<h3>Advance Search Options</h3>
<hr />

<p class="lead">Search by Price Range</p>

<form action="./get-products-by-price-range" method="get" class="form">
	<div class="form-group row">
		<label for="min" class="col-md-2">Minimum Price</label>
		<div class="col-md-4">
			<input type="number" autofocus="autofocus" id="min" name="min"
				class="form-control">
		</div>
	</div>
	<div class="form-group row">
		<label for="max" class="col-md-2">Maximum Price</label>
		<div class="col-md-4">
			<input type="number" id="max" name="max" class="form-control">
		</div>
	</div>

	<div class="form-group row">
		<label class="col-md-2"></label>
		<div class="col-md-4">
			<button class="btn btn-primary">Search</button>
		</div>
	</div>
</form>
<%@ include file="./footer.jsp"%>