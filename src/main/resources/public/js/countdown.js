var Famcation = Famcation || {};

Famcation.countdown = function () {
    return {
        startTimer: function () {
            var famcationTime = moment.parseZone("2019-08-10T15:00:00-05:00");
            var interval = 1000;

            var intervalId = setInterval(function () {
                // Time Out check
                if (famcationTime.diff(moment()) <= 0) {
                    clearInterval(intervalId);
                } else {
                    //Otherwise
                    $('.countdown').text(famcationTime.countdown().toString() + " until the next Famcation begins!");
                }
            }, interval);
        }
    }
}();

$(document).ready(Famcation.countdown.startTimer);
