/*
 * BabyFish, Object Model Framework for Java and JPA.
 * https://github.com/babyfish-ct/babyfish
 *
 * Copyright (c) 2008-2016, Tao Chen
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * Please visit "http://opensource.org/licenses/LGPL-3.0" to know more.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 */
package org.babyfish.test.collection.bidi;

import java.util.List;

import org.babyfish.collection.BidiType;
import org.babyfish.collection.MALinkedList;

public class BidiMALinkedListTest extends AbstractBidiListTest {

    @Override
    protected List<Unstable> createBidiList() {
        return new MALinkedList<>(BidiType.NONNULL_VALUES, Unstable.EQUALITY_COMPARATOR);
    }
}