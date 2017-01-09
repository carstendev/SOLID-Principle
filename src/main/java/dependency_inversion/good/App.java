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
package dependency_inversion.good;

/**
 * This example shows a solution to remove a violation of the dependency
 * inversion principle.
 * 
 * We can observe, that the human does not depend on a concrete implementation.
 * The class rather depends on the abstraction of an alarm.
 * 
 * This enables us to use different alarm implementations and also adhere to the
 * Open/Closed-Principle, because we can now add other alarm implementation in
 * the future without changing the human class.
 */
public class App {

    public static void main(String[] args) {
        Human human = new Human();
        human.setAlarm(new AlarmClock());

        Human otherHuman = new Human();
        otherHuman.setAlarm(new Phone());
    }

}
