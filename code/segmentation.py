#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
Created on Wed May 17 21:44:35 2017

@author: nanbinx
"""

import os
import json
import time
import codecs
import numpy as np
import pynlpir

from math import floor
from sklearn import linear_model
from sklearn import svm
# from sklearn.cross_validation import train_test_split
from sklearn.externals import joblib

import sys

reload(sys)
sys.setdefaultencoding('utf-8')

pynlpir.open()

ORIGINAL_PATH = "../data"
CLASSES = ["妇产", "消化", "眼科", "神经", "血液", "肾内", "骨科"]


def load_txt():
    result = []

    for index in range(len(CLASSES)):
        # Class name
        class_name = CLASSES[index]

        # Sub directory
        sub_dir = ORIGINAL_PATH + "/" + class_name

        # Txt list in sub directory
        txt = os.listdir(sub_dir)

        for txt_name in txt:
            # Txt relative path
            txt_path = os.path.join("%s/%s" % (sub_dir, txt_name))
            open_file = codecs.open(txt_path, "r", "utf-8")

            # Read txt
            single_txt = open_file.readlines()

            # for item in single_txt:
            #     print item

            result.append({
                "file": txt_name,
                "txt": single_txt,
                "label": index,
                "class": class_name
            })

    return result


txt_file = load_txt()

for txt in txt_file:
    segment = []
    s = txt["txt"]
    for string in s:
        print txt["class"], txt["file"]
        segment_str = pynlpir.segment(string)
        for word in segment_str:
            word_list = list(word)
            print word_list[0], word[1]
            segment.append(word_list[0])
