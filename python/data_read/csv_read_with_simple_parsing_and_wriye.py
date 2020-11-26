#!/usr/bin/env python3

import sys

input_file = sys.argv[1]
out_file = sys.argv[2]

with open(input_file,'r',newline='') as filereader:
  with open(out_file,'w',newline='') as fileWriter:
    header =  filereader.readline()

    # remove blank and according to , to cut.
    header = header.strip()
    header_list = header.split(',')
    print(header)

    fileWriter.write(','.join(map(str,header_list)) + '\n')
    for row in filereader:
      row = row.strip()
      row_list = row.split(',')
      print(row_list)
      fileWriter.write(','.join(map(str,row_list)) + '\n')