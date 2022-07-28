// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPhysicalConnectionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPhysicalConnectionsPlainArgs Empty = new GetPhysicalConnectionsPlainArgs();

    /**
     * A list of Physical Connection IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Physical Connection IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The include reservation data.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Boolean includeReservationData;

    /**
     * @return The include reservation data.
     * 
     */
    public Optional<Boolean> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * A regex string to filter results by Physical Connection name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Physical Connection name.
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
     * Resources on Behalf of a State of the Resource Attribute Field.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Resources on Behalf of a State of the Resource Attribute Field.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetPhysicalConnectionsPlainArgs() {}

    private GetPhysicalConnectionsPlainArgs(GetPhysicalConnectionsPlainArgs $) {
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPhysicalConnectionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPhysicalConnectionsPlainArgs $;

        public Builder() {
            $ = new GetPhysicalConnectionsPlainArgs();
        }

        public Builder(GetPhysicalConnectionsPlainArgs defaults) {
            $ = new GetPhysicalConnectionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Physical Connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Physical Connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData The include reservation data.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Boolean includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Physical Connection name.
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
         * @param status Resources on Behalf of a State of the Resource Attribute Field.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetPhysicalConnectionsPlainArgs build() {
            return $;
        }
    }

}
