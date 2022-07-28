// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEventBusesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventBusesPlainArgs Empty = new GetEventBusesPlainArgs();

    /**
     * The event bus type.
     * 
     */
    @Import(name="eventBusType")
    private @Nullable String eventBusType;

    /**
     * @return The event bus type.
     * 
     */
    public Optional<String> eventBusType() {
        return Optional.ofNullable(this.eventBusType);
    }

    /**
     * A list of Event Bus IDs. Its element value is same as Event Bus Name.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Event Bus IDs. Its element value is same as Event Bus Name.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The name prefix.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return The name prefix.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * A regex string to filter results by Event Bus name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Event Bus name.
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

    private GetEventBusesPlainArgs() {}

    private GetEventBusesPlainArgs(GetEventBusesPlainArgs $) {
        this.eventBusType = $.eventBusType;
        this.ids = $.ids;
        this.namePrefix = $.namePrefix;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventBusesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventBusesPlainArgs $;

        public Builder() {
            $ = new GetEventBusesPlainArgs();
        }

        public Builder(GetEventBusesPlainArgs defaults) {
            $ = new GetEventBusesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventBusType The event bus type.
         * 
         * @return builder
         * 
         */
        public Builder eventBusType(@Nullable String eventBusType) {
            $.eventBusType = eventBusType;
            return this;
        }

        /**
         * @param ids A list of Event Bus IDs. Its element value is same as Event Bus Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Event Bus IDs. Its element value is same as Event Bus Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param namePrefix The name prefix.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Event Bus name.
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

        public GetEventBusesPlainArgs build() {
            return $;
        }
    }

}
