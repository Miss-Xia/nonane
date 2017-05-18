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

from math import floor
from sklearn import linear_model
from sklearn import svm
from sklearn.cross_validation import train_test_split
from sklearn.externals import joblib
import pynlpir

pynlpir.open()



ORIGINAL_PATH = "../data"
CLASSES = ["妇产","消化","眼科","神经","血液","肾内","骨科"]


def load_txt():
    result = [] 
    for index in range(len(CLASSES)):
            # Class name
            class_name = CLASSES[index]
            # Sub directory
            sub_dir = ORIGINAL_PATH + '/' + class_name
            # Txt list in sub directory
            txt = os.listdir(sub_dir)
            
            for txt_name in txt:
                # Txt relative path
                txt_path = os.path.join("%s/%s" % (sub_dir,txt_name))
                file = codecs.open(txt_path,'r','utf-8')
                # Read txt
                single_txt = file.readlines()
                single_txt = str(single_txt).encode("utf-8")
                print("Load txt" + class_name + "_" + txt_name + " done")
            
                result.append({
                           "txt": single_txt,
                           "label": index,
                           "class": class_name
                           })

    return result

        
txt_file = load_txt()
#txt_segment=[]
for txt in txt_file:
    segment = []
    s = txt['txt']
    for string in s:
        segment_str = pynlpir.segment(string)
        for word in segment_str:
            word_list = list(word)
            segment.append(word_list[0])
            #print(word_list[0] + "done")
#txt_segment = "" .join(segment)

    
        
        

    

