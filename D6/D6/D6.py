
import sys
import cv2
import math
from PyQt5 import QtWidgets
from PyQt5.QtCore import pyqtSlot
from PyQt5.QtGui import QImage ,QPixmap
from PyQt5.QtWidgets import QMainWindow, QFileDialog
from PyQt5.uic import loadUi
import numpy as np
from matplotlib import pyplot as plt


class ShowImage(QMainWindow):


    def __init__(self):
        super(ShowImage, self).__init__()
        loadUi('untitled.ui',self)
        self.image = None
        self.pushButton.clicked.connect(self.loadClicked)
        self.grayButton.clicked.connect(self.grayClicked)
        self.actionBrightness.triggered.connect(self.actionbrightness)
        self.actionSimple_Contrast.triggered.connect(self.actionContrast)
        self.actionContrast_Stretching.triggered.connect(self.actionContrast2)
        self.actionNegative_Image.triggered.connect(self.actionNegativeI)
        self.actionBiner_Image.triggered.connect(self.actionBinerI)
        self.actionHistogram_Grayscale.triggered.connect(self.actionGrayH)
        self.actionRGB_Histogram.triggered.connect(self.actionRGBH)
        self.actionHistogram_Equalization.triggered.connect(self.actionEqualH)
        self.actionTranslasi.triggered.connect(self.actiontranslasi)
        self.action_45_Derajat.triggered.connect(self.actionmin45)
        self.action45_Derajat.triggered.connect(self.action45)
        self.action_90_Derajat.triggered.connect(self.actionmin90)
        self.action90_Derajat.triggered.connect(self.action90)
        self.action180_Derajat.triggered.connect(self.action180)
        self.actionZoom_in.triggered.connect(self.actionZoomin)
        self.actionZoom_out.triggered.connect(self.actionZoomout)
        self.actionSkewed_Image.triggered.connect(self.actionSkewedImage)
        self.actionCrop.triggered.connect(self.cropClicked)
        self.actionKonvolusi.triggered.connect(self.filteringClicked)
        self.actionMeanFilter.triggered.connect(self.meanfilter)
        self.actionGaussian_Filter.triggered.connect(self.gaussian)
        self.actionSharping.triggered.connect(self.sharpening)
        self.actionMedian_Filtering.triggered.connect(self.median)
        self.actionMax_Filtering.triggered.connect(self.maxfilter)

    @pyqtSlot()
    def filteringClicked(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        # x, y = gray.shape[:2]
        # kernel = np.ones((5, 5), np.float32)/25
        # h = 5 / 2
        # w = 5 / 2
        img_out = cv2.blur(gray, (5, 5))
        # img_out = cv2.fulter2D(gray, -1, kernel)
        # for i in np.arange(h):
        #     for j in np.arange(w):
        #         sum = 0
        #         for k in -h to h:
        #             for l in -w to w:
        #                 a = gray[i+k, j+1]
        #                 w = img_out(h = k, w = 1)
        #                 sum = sum + (w*a)
        #         out[i,j] = sum
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()

    def meanfilter(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        kernel = np.array([[1 / 4, 1 / 4], [1 / 4, 1 / 4]])
        img_out = cv2.filter2D(gray, -1, kernel)
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()

    def gaussian(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        # kernel =
        img_out = cv2.GaussianBlur(gray, (5, 5), 0)
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()

    def sharpening(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        kernel = np.array([[0, -1, 0], [-1, 5, -1], [0, -1, 0]])
        img_out = cv2.filter2D(gray, -1, kernel)
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()

    def median(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        # kernel =
        img_out = cv2.medianBlur(gray, 5)
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()
        cv2.dilate(gray, cv2.getStructuringElement(cv2.MORPH_RECT, (5, 5)))

    def maxfilter(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        # kernel =
        img_out = cv2.dilate(gray, cv2.getStructuringElement(cv2.MORPH_RECT, (5, 5)))
        plt.imshow(img_out, cmap='gray', interpolation='bicubic')
        plt.xticks([], plt.yticks([]))
        plt.show()

    def actionbrightness(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        brightness = self.horizontalSlider.value()
        h, w = gray.shape[:2]
        for i in np.arange(h):
            for j in np.arange(w):
                a = gray.item(i, j)
                b = a + brightness
                if b > 255:
                    b = 255
                elif b < 0:
                    b = 0
                else:
                    b = b
                gray.itemset((i, j), b)
        self.image = gray
        self.displayImage(2)

    def actionContrast(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        contrast = self.horizontalSlider_2.value    ()
        h, w = gray.shape[:2]
        for i in np.arange(h):
            for j in np.arange(w):
                a = gray.item(i, j)
                b = np.math.ceil(a * contrast)
                if b > 255:
                    b = 255
                elif b < 0:
                    b = 0
                else:
                    b = b
                gray.itemset((i, j), b)
        self.image = gray
        self.displayImage(2)

    def actionContrast2(self):
        img = cv2.imread('jantung.jpg')
        H, W = img.shape[:2]
        gray = np.zeros((H, W), np.uint8)
        for i in range(H):
            for j in range(W):
                gray[i, j] = np.clip(0.299 * img[i, j, 0] + 0.587 * img[i, j, 1] + 0.114 * img[i, j, 2], 0, 255)
                a = gray[i, j]
                if a > 255:
                    a = 255
                elif a < 0:
                    a = 0
                else:
                    a = a
                b = np.math.ceil(((a - 255) / (255 - 0)) * 255)
                gray.itemset((i, j), b)
        self.image = gray
        self.displayImage(2)

    def actionNegativeI(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        max_intensity = 255
        h, w = gray.shape[:2]
        for i in np.arange(h):
            for j in np.arange(w):
                a = gray.item(i, j)
                b = max_intensity - a
                if b > 255:
                    b = 255
                elif b < 0:
                    b = 0
                else:
                    b = b
                gray.itemset((i, j), b)
        self.image = gray
        self.displayImage(2)

    def actionBinerI(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        a1 = 150
        a2 = 50
        h, w = gray.shape[:2]
        for i in np.arange(h):
            for j in np.arange(w):
                a = gray.item(i, j)
                if a < a1:
                    a = a1
                elif a >= a2:
                    a = a2
                else:
                    a = a
                gray.itemset((i, j), a)
        self.image = gray
        self.displayImage(2)

    def actionGrayH(self):
        img = cv2.imread('jantung.jpg')
        gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
        h, w = gray.shape[:2]
        for i in np.arange(h):
            for j in np.arange(w):
                a = gray.item(i, j)
                gray.itemset((i, j), a)
        self.image = gray
        self.displayImage(2)
        plt.hist(gray.ravel(), 255, [0, 255])
        plt.show()

    def actionRGBH(self):
        img = cv2.imread('jantung.jpg')
        color = ('b', 'g', 'r')
        for i, col in enumerate(color):
            histo = cv2.calcHist([img], [i], None, [256], [0, 256])
            plt.plot(histo, color = col)
            plt.xlim([0, 256])
        plt.show()

    def actionEqualH(self):
        img = cv2.imread('jantung.jpg')
        hist, bins = np.histogram(img.flatten(), 256, [0, 256])
        cdf = hist.cumsum()
        cdf_normalized = cdf * hist.max() / cdf.max()
        cdf_m = np.ma.masked_equal(cdf, 0)
        cdf_m = (cdf_m - cdf_m.min()) * 255 / (cdf_m.max() - cdf_m.min())
        cdf = np.ma.filled(cdf_m, 0).astype('uint8')
        self.image = cdf[img]
        self.displayImage(2)

        plt.plot(cdf_normalized, color = 'b')
        plt.hist(img.flatten(), 256, [0, 256], color = 'r')
        plt.xlim([0, 256])
        plt.legend(('cdf', 'histogram'), loc = 'upper left')
        plt.show()

    def actiontranslasi(self):
        img = cv2.imread('jantung.jpg')
        h,w = img.shape[:2]
        quarter_h, quarter_w = h/4, w/4
        T = np.float32([[1, 0, quarter_w], [0, 1, quarter_h]])
        gray = cv2.warpAffine(img, T, (w, h))
        self.image = gray
        self.displayImage(2)

    def actionmin45(self):
        img = cv2.imread('jantung.jpg')
        h, w = self.image.shape[:2]

        rotationMatrix = cv2.getRotationMatrix2D((w/2, h/2), -45, .7)
        cos = np.abs(rotationMatrix[0, 0])
        sin = np.abs(rotationMatrix[0, 1])

        nW = int((h*sin) + (w*cos))
        nH = int((h*cos) + (w*sin))

        rotationMatrix[0, 2] += (nW/2) - w/2
        rotationMatrix[1, 2] += (nH/2) - h/2

        rot_image = cv2.warpAffine(img, rotationMatrix, (h, w))
        self.image=rot_image
        self.displayImage(1)

    def action45(self):
        img = cv2.imread('jantung.jpg')
        h, w = self.image.shape[:2]

        rotationMatrix = cv2.getRotationMatrix2D((w / 2, h / 2), 45, .7)
        cos = np.abs(rotationMatrix[0, 0])
        sin = np.abs(rotationMatrix[0, 1])

        nW = int((h * sin) + (w * cos))
        nH = int((h * cos) + (w * sin))

        rotationMatrix[0, 2] += (nW / 2) - w / 2
        rotationMatrix[1, 2] += (nH / 2) - h / 2

        rot_image = cv2.warpAffine(img, rotationMatrix, (h, w))
        self.image = rot_image
        self.displayImage(1)

    def actionmin90(self):
        img = cv2.imread('jantung.jpg')
        h, w = self.image.shape[:2]

        rotationMatrix = cv2.getRotationMatrix2D((w / 2, h / 2), -90, 1)
        cos = np.abs(rotationMatrix[0, 0])
        sin = np.abs(rotationMatrix[0, 1])

        nW = int((h * sin) + (w * cos))
        nH = int((h * cos) + (w * sin))

        rotationMatrix[0, 2] += (nW / 2) - w / 2
        rotationMatrix[1, 2] += (nH / 2) - h / 2

        rot_image = cv2.warpAffine(img, rotationMatrix, (h, w))
        self.image = rot_image
        self.displayImage(1)

    def action90(self):
        img = cv2.imread('jantung.jpg')
        h, w = self.image.shape[:2]

        rotationMatrix = cv2.getRotationMatrix2D((w / 2, h / 2), 90, 1)
        cos = np.abs(rotationMatrix[0, 0])
        sin = np.abs(rotationMatrix[0, 1])

        nW = int((h * sin) + (w * cos))
        nH = int((h * cos) + (w * sin))

        rotationMatrix[0, 2] += (nW / 2) - w / 2
        rotationMatrix[1, 2] += (nH / 2) - h / 2

        rot_image = cv2.warpAffine(img, rotationMatrix, (h, w))
        self.image = rot_image
        self.displayImage(1)

    def action180(self):
        img = cv2.imread('jantung.jpg')
        h, w = self.image.shape[:2]

        rotationMatrix = cv2.getRotationMatrix2D((w / 2, h / 2), 180, 1)
        cos = np.abs(rotationMatrix[0, 0])
        sin = np.abs(rotationMatrix[0, 1])

        nW = int((h * sin) + (w * cos))
        nH = int((h * cos) + (w * sin))

        rotationMatrix[0, 2] += (nW / 2) - w / 2
        rotationMatrix[1, 2] += (nH / 2) - h / 2

        rot_image = cv2.warpAffine(img, rotationMatrix, (h, w))
        self.image = rot_image
        self.displayImage(1)

    def actionZoomin(self):
        img = cv2.imread('jantung.jpg')
        resize_img=cv2.resize(img,None,fx=2,fy=2,interpolation=cv2.INTER_CUBIC)
        cv2.imshow('Zoom in', resize_img)

    def actionZoomout(self):
        img = cv2.imread('jantung.jpg')
        resize_img = cv2.resize(img,None,fx=0.50,fy=0.50)
        cv2.imshow('Zoom out', resize_img)

    def actionSkewedImage(self):
        img = cv2.imread('jantung.jpg')
        resize_img=cv2.resize(img,(900,400),interpolation=cv2.INTER_AREA)
        cv2.imshow('Skewed Image',resize_img)

    def cropClicked(self):
        #img = cv2.imread('jantung.jpg.jpg')
        x1 = 30
        y1 = 30
        x2 = 250
        y2 = 250
        img = self.image[x1:x2, y1:y2]
        cv2.imshow('Crop', img)

    def saveClicked(self):
        flname, filter = QFileDialog.getSaveFileName(self, 'Save File', 'D:\\', "Image Files (*.jpg)")
        if flname:
            cv2.imwrite(flname, self.image)
        else:
            print('error')

    def loadClicked(self):
        self.loadImage('AB.jpg')

    def grayClicked(self):
        H, W = self.image.shape[:2]
        gray = np.zeros((H, W), np.uint8)
        for i in range (H):
            for j in range (W):
                gray[i,j]= np.clip(0.299 * self.image[i, j, 0] + 0.587 * self.image[i, j, 1] + 0.114 * self.image[i, j, 2], 0, 255)
        self.image = gray
        self.displayImage(2)

    def loadImage(self,flname):
        self.image = cv2.imread(flname, cv2.IMREAD_COLOR)
        self.displayImage()

    def displayImage(self, windows=1):
        qformat = QImage.Format_Indexed8
        img = QImage(self.image, self.image.shape[1], self.image.shape[0], self.image.strides[0], qformat)
        img = img.rgbSwapped()
        if windows == 1:
            self.imgLabel.setPixmap(QPixmap.fromImage(img))
            self.imgLabel.setScaledContents(True)
        if windows == 2:
            self.hasilLabel.setPixmap(QPixmap.fromImage(img))
            self.hasilLabel.setScaledContents(True)

        if len(self.image.shape) == 3:
            if (self.image.shape[2]) == 4:
                qformat = QImage.Format_RGBA8888

            else:
                qformat = QImage.Format_RGB888
                img = QImage(self.image, self.image.shape[1], self.image.shape[0], self.image.strides[0], qformat)

                img = img.rgbSwapped()

                self.imgLabel.setPixmap(QPixmap.fromImage(img))

app = QtWidgets.QApplication(sys.argv)
window = ShowImage()
window.setWindowTitle('Show Image GUI')
window.show()
sys.exit(app.exec_())
