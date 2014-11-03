function init(){

	if(document.cookie.indexOf("visited") == -1) {
		document.cookie = "visited=" + track[0] +"."+(new Date()).getTime() + "; "+getExpiration()+";";
		visited = true;
	}
}

function getExpiration(){
	var d = new Date();
    d.setTime(d.getTime() + (2*365*24*60*60*1000));
    var expires = "expires="+d.toUTCString();
	return expires;
}
	
function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1);
        if (c.indexOf(name) != -1) return c.substring(name.length,c.length);
    }
    return "";
}

function getFechaActual(){
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1;
	var yyyy = today.getFullYear();
	
	if(dd<10){
		dd = '0'+dd;
	}
	
	if(mm<10){
		mm = '0'+mm;
	}
	
	today = dd + '/' + mm + '/' + yyyy;

	return today;
}

function getHoraActual(){
	var hora = new Date();
	var min = hora.getMinutes();
	var hour = hora.getHours();
	
	hora = hour+':'+min;
	return hora;
}

var dir = "http://190.178.3.161:8080/WebAnalyticsG3/DataCatch";

var visited = false;
init();

var i = new Image(1,1);
i.src = dir + "?user="+ track[0] +"&url=" + document.URL + "&newvisit=" + visited + "&date=" + getFechaActual() + "&time=" + getHoraActual();