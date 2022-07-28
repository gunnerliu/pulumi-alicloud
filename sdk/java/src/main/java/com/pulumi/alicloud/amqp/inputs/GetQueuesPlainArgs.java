// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueuesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueuesPlainArgs Empty = new GetQueuesPlainArgs();

    /**
     * A list of Queue IDs. Its element value is same as Queue Name.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Queue IDs. Its element value is same as Queue Name.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * A regex string to filter results by Queue name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Queue name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The name of the virtual host.
     * 
     */
    @Import(name="virtualHostName", required=true)
    private String virtualHostName;

    /**
     * @return The name of the virtual host.
     * 
     */
    public String virtualHostName() {
        return this.virtualHostName;
    }

    private GetQueuesPlainArgs() {}

    private GetQueuesPlainArgs(GetQueuesPlainArgs $) {
        this.ids = $.ids;
        this.instanceId = $.instanceId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.virtualHostName = $.virtualHostName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueuesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueuesPlainArgs $;

        public Builder() {
            $ = new GetQueuesPlainArgs();
        }

        public Builder(GetQueuesPlainArgs defaults) {
            $ = new GetQueuesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Queue IDs. Its element value is same as Queue Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Queue IDs. Its element value is same as Queue Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Queue name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param virtualHostName The name of the virtual host.
         * 
         * @return builder
         * 
         */
        public Builder virtualHostName(String virtualHostName) {
            $.virtualHostName = virtualHostName;
            return this;
        }

        public GetQueuesPlainArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.virtualHostName = Objects.requireNonNull($.virtualHostName, "expected parameter 'virtualHostName' to be non-null");
            return $;
        }
    }

}
