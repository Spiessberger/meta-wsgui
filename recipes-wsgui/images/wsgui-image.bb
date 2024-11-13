inherit core-image
inherit populate_sdk_qt6_base

IMAGE_INSTALL += " \
  ttf-roboto \
  packagegroup-qt6-modules \
  "

KERNEL_MODULE_AUTOLOAD:rpi += " i2c-dev"
ENABLE_I2C = "1"
ENABLE_SPI = "1"
