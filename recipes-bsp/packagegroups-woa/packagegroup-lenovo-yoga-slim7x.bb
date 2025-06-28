SUMMARY = "Packages for the Lenovo Yoga Slim7x laptop"

inherit packagegroup

PACKAGES = " \
    ${PN}-firmware \
"

RRECOMMENDS:${PN}-firmware = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'linux-firmware-qcom-adreno-g750 linux-firmware-qcom-x1e80100-lenovo-yoga-slim7x-adreno', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'linux-firmware-ath12k-wcn7850', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'bluetooth', 'linux-firmware-qca-wcn7850', '', d)} \
    linux-firmware-qcom-x1e80100-lenovo-yoga-slim7x-audio \
    linux-firmware-qcom-x1e80100-lenovo-yoga-slim7x-compute \
    linux-firmware-qcom-x1e80100-lenovo-yoga-slim7x-vpu \
"
