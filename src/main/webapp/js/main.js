(function(document, $, yawp) {
	$(document).ready(function() {
		console.log('PRE');
		yawp('/entidades').list(function (entidades) {
			console.log(entidades);
		});
	});
})(document, jQuery, yawp);