<%@ include file="./header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<h2>${title==null? "Product Details": title}</h2>

<sf:form modelAttribute="pr" cssClass="form" action="./save-product">

	<sf:hidden path="id" />

	<div class="form-group row">
		<label class="col-md-3">Name</label>
		<div class="col-md-6">
			<sf:input path="name" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Description</label>
		<div class="col-md-6">
			<sf:input path="description" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Category</label>
		<div class="col-md-6">
			<sf:input path="category" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Brand</label>
		<div class="col-md-6">
			<sf:input path="brand" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Unit Price</label>
		<div class="col-md-6">
			<sf:input path="unitPrice" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Quantity Per Unit</label>
		<div class="col-md-6">
			<sf:input path="quantityPerUnit" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Picture (URL)</label>
		<div class="col-md-6">
			<sf:input path="picture" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3">Discount</label>
		<div class="col-md-6">
			<sf:input path="discount" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group row">
		<label class="col-md-3"></label>
		<div class="col-md-6">
			<button class="btn btn-primary">Save Changes</button>
		</div>
	</div>


</sf:form>


<%@ include file="./footer.jsp"%>