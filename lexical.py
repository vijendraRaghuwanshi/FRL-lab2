from skimage import io
from myplotlib import pyplot as plt
rgb=io.imread("C:/Users/Disha/Desktop/tiger.jpeg")
r, g, b = rgb[:,:,2], rgb[:,:,1], rgb[:,:,0]
rgb = 0.2989 * r + 0.5870 * g + 0.1140 * b
plt.gray()
plt.imshow(rgb)