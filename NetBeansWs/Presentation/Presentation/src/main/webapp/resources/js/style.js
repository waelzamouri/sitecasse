/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $(function () {

        $(document).on('scroll', function () {

            if ($(window).scrollTop() > 100) {
                $('.scroll-top-wrapper').addClass('show');
            } else {
                $('.scroll-top-wrapper').removeClass('show');
            }
        });

        $('.scroll-top-wrapper').on('click', scrollToTop);
    });

    function scrollToTop() {
        verticalOffset = typeof (verticalOffset) != 'undefined' ? verticalOffset : 0;
        element = $('body');
        offset = element.offset();
        offsetTop = offset.top;
        $('html, body').animate({scrollTop: offsetTop}, 500, 'linear');
    }



// Autocompletion
//Marque
    $(function () {

        var availableTags = [
            "Renault", "Citroen", "Ford", "Peugeot", "Mercedes", "BMW",
            "Audi", "Nissan", "Seat", "Volkswagen", "Fiat", "Alfa Rome",
            "Hyundai", "Suzuki", "Rover", "Mitsubishi","Abarth","Ac","Acrea",
            "Acura","Aixam","Alpina","Alpine","Amc","Aro","Asia","Aston Martin",
            "Austin","Austin Healy","Autobianchi","Auverland","Bedford","Bellier",
            "Bentley","Bertone","Bugati","Buick","Cadillac","Carver","Caterham","Chatenet",
            "Chevrolet","Chrysler","Corvette","Dacia","Daewoo","Daf","Daihatsu","Daimler",
            "Dallas","Dangel","Datsun","De la Chapelle","Delahaye","DKW/Auto Union","Dodge",
            "Excalibur","Facel Vega","Ferrari","Ford USA","FSO","Galloper","GMC","GME","Grecav",
            "Hommel","Honda","Infiniti","ISUZU","Iveco","Jaguar","Kia","Lancia","Land Rover",
            "Lexus","Lotus","Mazda","MG","Mini","Porche","SAAB","Skoda","Smart","Subaru","Volvo",
            
        ];
        $("#form-rech\\:marque").autocomplete({
            source: availableTags
        });
    });



    $(("#form-rech\\:modele")).focus(function () {
        var modele = [];
        //alert("fonction");
        if ($(("#form-rech\\:marque")).val() === "Renault") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Citroen") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Peugeot") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Volkdswagen") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Ford") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Opel") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Mercedes") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Fiat") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Nissan") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Audi") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "BMW") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Toyota") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Seat") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Alfa Romeo") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Hyundai") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Suzuki") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Rover") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Mitsubishi") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Abarth") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Ac") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Acrea") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Acura") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Aixam") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Alpina") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Alpine") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "AMC") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "ARO") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Asia") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Aston Martin") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Austin Healey") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Autobianchi") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Auverland") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Bedford") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Bellier") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Bentley") {
            modele = [
            ];

        } else if ($(("#form-rech\\:marque")).val() === "Bugatti") {
            modele = [
            ];

        }
        $("#form-rech\\:modele").autocomplete({
            source: modele
        });


    })

});

