$(document).ready(function () {
    $(".usHome .navigasi li").hover(function () {
        $(this).find("ul").slideToggle("normal");
    });

    $(".usBid .navigasi li").hover(function () {
        $(this).find("ul").slideToggle("normal");
    });

    $(".usFeedback .navigasi li").hover(function () {
        $(this).find("ul").slideToggle("normal");
    });

    $(".usLelang .navigasi li").hover(function () {
        $(this).find("ul").slideToggle("normal");
    });

    $(".usContact .navigasi li").hover(function () {
        $(this).find("ul").slideToggle("normal");
    });
});

function login(){
    if((document.log.username.value!='')&&(document.log.password.value!='')&&(document.log.type.value!=0)){
        return true;
    }
    else
        alert('Isi dengan benar');
        return false;
}

function checkIsi(){
    if((document.isi.item.value!='')&&(document.isi.kondisi.value!='')&&(document.isi.kode.value!='')&&(document.isi.lokasi.value!='')){
        return true;
    }
    else
        alert('Isi dengan benar');
        return false;
}
