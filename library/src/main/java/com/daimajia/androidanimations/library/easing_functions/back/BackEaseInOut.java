/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.daimajia.androidanimations.library.easing_functions.back;

import com.daimajia.androidanimations.library.easing_functions.BaseEasingMethod;

public class BackEaseInOut extends BaseEasingMethod{

    private float s = 1.70158f;

    public BackEaseInOut(float duration) {
        super(duration);
    }

    public BackEaseInOut(float duration, float back){
        this(duration);
        s = back;
    }

    @Override
    public float getInterpolation(float input) {
        float t = input*2.0f;

        if ((t) < 1)
            return (t*t*(((s*=(1.525f))+1)*t - s))/2.0f;

        return ((t-=2)*t*(((s*=(1.525f))+1)*t + s) + 2)/2.0f;
    }
}
