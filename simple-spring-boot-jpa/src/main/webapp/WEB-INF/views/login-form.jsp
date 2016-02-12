<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="/public/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<h1>Login</h1>
	<form class="form-inline" action="/j_security_check" method="post">
	  <input type="text" class="input-small" placeholder="Email" name="email">
	  <input type="password" class="input-small" placeholder="Password" name="password">
	  <label class="checkbox">
	    <input type="checkbox"> Remember me
	  </label>
	  <button type="submit" class="btn">Sign in</button>
	</form>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="/public/js/bootstrap.min.js"></script>
</body>
</html>