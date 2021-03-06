package com.depli.store.cache.descriptor;

/**
 * StackTrace Descriptor
 *
 * Entity to keep StackTrace data of threads observed by a remote JMX connection in runtime.
 *
 * @author Lahiru Pathirage
 * @since 3/22/17
 */

public class StackTraceDescriptor {

    /*
    * JMX remote node ID
    */
    private Long nodeId;

    /**
     * Returns the related node ID of the remote mbean server connection generated by
     * persistent database.
     *
     * @return nodeID remote JVM node ID.
     */
    public Long getNodeId() {
        return nodeId;
    }

    /**
     * Sets the related node ID of the remote mbean server connection generated by
     * persistent database.
     *
     * @param nodeId remote JVM node ID.
     */
    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}
