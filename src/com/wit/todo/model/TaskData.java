package com.wit.todo.model;

import java.util.Set;

public class TaskData {

 private Set<Task> annsTasks;
 private Set<Task> bobsTasks;
 private Set<Task> carolsTasks;
 private Set<Task> unassignedTasks;

 public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
  this.annsTasks = annsTasks;
  this.bobsTasks = bobsTasks;
  this.carolsTasks = carolsTasks;
  this.unassignedTasks = unassignedTasks;
 }

 public Set<Task> getAnnsTasks() {
  return annsTasks;
 }

 public Set<Task> getBobsTasks() {
  return bobsTasks;
 }

 public Set<Task> getCarolsTasks() {
  return carolsTasks;
 }

 public Set<Task> getUnassignedTasks() {
  return unassignedTasks;
 }

 public Set<Task> getTasks(String taskOwnerName){

   if (taskOwnerName.equalsIgnoreCase("ann")) {
    return annsTasks;

   }
  return null;
 }

}
