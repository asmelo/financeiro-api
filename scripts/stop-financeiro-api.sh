#!/bin/bash
ps -ef | grep financeiro-api | grep -v grep | awk '{print $2}' | xargs sudo kill
