// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHoneyPotsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHoneyPotsPlainArgs Empty = new GetHoneyPotsPlainArgs();

    /**
     * Honeypot ID.
     * 
     */
    @Import(name="honeypotId")
    private @Nullable String honeypotId;

    /**
     * @return Honeypot ID.
     * 
     */
    public Optional<String> honeypotId() {
        return Optional.ofNullable(this.honeypotId);
    }

    /**
     * Honeypot custom name.
     * 
     */
    @Import(name="honeypotName")
    private @Nullable String honeypotName;

    /**
     * @return Honeypot custom name.
     * 
     */
    public Optional<String> honeypotName() {
        return Optional.ofNullable(this.honeypotName);
    }

    /**
     * A list of Honey Pot IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Honey Pot IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by honey pot name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by honey pot name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The ID of the honeypot management node.
     * 
     */
    @Import(name="nodeId")
    private @Nullable String nodeId;

    /**
     * @return The ID of the honeypot management node.
     * 
     */
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="nodeName")
    private @Nullable String nodeName;

    public Optional<String> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetHoneyPotsPlainArgs() {}

    private GetHoneyPotsPlainArgs(GetHoneyPotsPlainArgs $) {
        this.honeypotId = $.honeypotId;
        this.honeypotName = $.honeypotName;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.nodeId = $.nodeId;
        this.nodeName = $.nodeName;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHoneyPotsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHoneyPotsPlainArgs $;

        public Builder() {
            $ = new GetHoneyPotsPlainArgs();
        }

        public Builder(GetHoneyPotsPlainArgs defaults) {
            $ = new GetHoneyPotsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param honeypotId Honeypot ID.
         * 
         * @return builder
         * 
         */
        public Builder honeypotId(@Nullable String honeypotId) {
            $.honeypotId = honeypotId;
            return this;
        }

        /**
         * @param honeypotName Honeypot custom name.
         * 
         * @return builder
         * 
         */
        public Builder honeypotName(@Nullable String honeypotName) {
            $.honeypotName = honeypotName;
            return this;
        }

        /**
         * @param ids A list of Honey Pot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Honey Pot IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by honey pot name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nodeId The ID of the honeypot management node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable String nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeName(@Nullable String nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetHoneyPotsPlainArgs build() {
            return $;
        }
    }

}