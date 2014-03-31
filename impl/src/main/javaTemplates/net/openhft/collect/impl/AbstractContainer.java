/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.openhft.collect.impl;

import net.openhft.collect.Container;


public abstract class AbstractContainer implements Container {

    @Override
    public int size() {
        long sizeAsLong = sizeAsLong();
        return sizeAsLong <= Integer.MAX_VALUE ? (int) sizeAsLong : Integer.MAX_VALUE;
    }

    @Override
    public long sizeAsLong() {
        return (long) size();
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();
}
