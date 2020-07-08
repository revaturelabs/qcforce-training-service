/**
 * Provides the model classes which are used to represent data for Revature
 * batches, employees, and associates.
 * <p>
 * The model package comprises five classes: {@link Associate}, {@link Batch},
 * {@link Employee}, {@link EmployeeBatch}, and {@link EmployeeBatchId}. The
 * {@code Associate}, {@code Batch}, and {@code Employee} classes each represent
 * their respective real-world equivalent. The {@code EmployeeBatch} class is
 * used to represent relationships between individual employees and individual
 * batches. The {@code EmployeeBatchId} class is a composite key, comprising and
 * employee ID and a batch ID, used to identify a unique relationship between a
 * given employee and a given batch.
 *
 * @since 1.0
 */
package com.revature.model;