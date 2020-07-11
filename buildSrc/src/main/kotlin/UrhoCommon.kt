//
// Copyright (c) 2008-2020 the Urho3D project.
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import java.io.File

const val ndkSideBySideVersion = "21.3.6528147"
const val cmakeVersion = "3.17.3"

/**
 * Apply Urho3D custom plugin for the given platform.
 *
 * Current supported platforms: android.
 */
@Suppress("unused")
fun PluginDependenciesSpec.urho3d(platform: String): PluginDependencySpec = id("com.github.urho3d.$platform")

/**
 * Naive implementation of "touch" command.
 */
@Suppress("unused")
fun File.touch() = createNewFile() || setLastModified(System.currentTimeMillis())
