#!/usr/bin/env bash
cd /tmp
sudo java -jar -Dserver.port=8080 \
    *.jar > /dev/null 2> /dev/null < /dev/null &