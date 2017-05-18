var count=6;
		function show(aci){
			for(var i=1;i<=count;i++){
				var a=document.getElementById('al'+i);
				var c=document.getElementById('content'+i);
				if(i===aci){
					a.className="on";
					c.className="content activecontent";
				}else{
					a.className="";
					c.className="content hiddencontent";
				}
			}
		}