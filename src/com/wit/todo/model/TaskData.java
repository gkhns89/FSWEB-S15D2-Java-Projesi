package com.wit.todo.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
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
  if (taskOwnerName.equalsIgnoreCase("bob")) {
   return bobsTasks;

  }
  if (taskOwnerName.equalsIgnoreCase("carol")) {
   return carolsTasks;

  }
  if (taskOwnerName.equalsIgnoreCase("all")) {
   return carolsTasks;

  }
  return new HashSet<>();
 }
 public Set<Task> getUnionsExample(Set<Task>... toBeUnions) {
  Set<Task> totals = new LinkedHashSet<>();  // COPY
  for(Set<Task> G: toBeUnions){
   totals.add((Task)G);
  }
  return totals;
 }
 public Set<Task> getIntersect(Set<Task> firstCircle, Set<Task> secondCircle){
  Set<Task> inters = new HashSet<>(firstCircle);
  inters.retainAll(secondCircle);
  return inters;

 }
 public Set<Task> getDifference(Set<Task> firstCircle, Set<Task> secondCircle){
  Set<Task> differs = new HashSet<>(firstCircle);
  differs.removeAll(secondCircle);
  return differs;
 }
}
