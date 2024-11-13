inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE = "1000000"

IMAGE_INSTALL += " \
  ttf-roboto \
  packagegroup-qt6-modules \
  "

KERNEL_MODULE_AUTOLOAD:rpi += " i2c-dev"
ENABLE_I2C = "1"
ENABLE_SPI = "1"
