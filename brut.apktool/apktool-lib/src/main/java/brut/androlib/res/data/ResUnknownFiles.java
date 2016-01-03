/**
 *  Copyright 2014 Ryszard Wiśniewski <brut.alll@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.androlib.res.data;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Connor Tumbleson <connor.tumbleson@gmail.com>
 */
public class ResUnknownFiles {

    private final Map<byte[], String> mUnknownFiles = new LinkedHashMap<byte[], String>();

    public void addUnknownFileInfo(String file, String value) {
        mUnknownFiles.put(file.getBytes(StandardCharsets.UTF_8), value);
    }

    public Map<byte[], String> getUnknownFiles() {
        return mUnknownFiles;
    }
}
