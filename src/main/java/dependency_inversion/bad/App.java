/**
 * The MIT License
 * Copyright (c) 2016-2018 Carsten Timpert
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package dependency_inversion.bad;

/**
 * This App example showcases a violation of the dependency inversion principle.
 * 
 * We can observe, that the human depends on a concrete implementation of the
 * phone class, rather than abstraction. Because of this we are not able to
 * exchange the Phone for an other alarm implementation.
 * 
 * To remove the violation of the dependency inversion principle, we would want
 * to replace the concrete phone implementation with an abstraction for the
 * alarm functionality.
 */
public class App {

    public static void main(String[] args) {
	Phone phone = new Phone();
	Human human = new Human();
	human.setAlarm(phone);
    }

}
