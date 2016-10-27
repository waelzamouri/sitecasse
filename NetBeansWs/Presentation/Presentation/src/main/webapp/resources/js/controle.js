/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function controleCon() {
    var mail = document.getElementById('form-con:mail').value;
    var mdp = document.getElementById('form-con:mdp').value;
    if (mail == "" || mdp == "") {
        $('#myModal').modal('show');
        return false;
    }
    return true;
}
function controleEnrg() {
    var mail = document.getElementById('form-enregistrer:mail').value;
    var mdp = document.getElementById('form-enregistrer:mdp').value;
    if (mail == "" || mdp == "") {
        $('#myModal').modal('show');
        
        return false;
    }
    return true;
}



