/*
 * Copyright 2012 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.kie.services.api.bpmn2;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.jbpm.kie.services.impl.model.ProcessAssetDesc;
import org.kie.internal.task.api.model.TaskDef;

public interface BPMN2DataService {
    Map<String, String> getAssociatedEntities(String processId);
    List<String> getAssociatedDomainObjects(String processId);
    Map<String, String> getProcessData(String processId);
    List<String> getAssociatedForms(String processId);
    Collection<TaskDef> getAllTasksDef(String processId);
    ProcessAssetDesc getProcessDesc(String processId);
    Map<String, String> getTaskInputMappings(String processId, String taskName);
    Map<String, String> getTaskOutputMappings(String processId, String taskName);
    Collection<String> getReusableSubProcesses(String processId);
    ProcessAssetDesc findProcessId(String bpmn2Content, ClassLoader classLoader);
    Map<String, String> getAllServiceTasks(String processId);
}
