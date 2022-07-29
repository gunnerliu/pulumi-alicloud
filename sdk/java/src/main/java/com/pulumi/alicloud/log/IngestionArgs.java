// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IngestionArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngestionArgs Empty = new IngestionArgs();

    /**
     * Ingestion job description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Ingestion job description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name displayed on the web page.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name displayed on the web page.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Ingestion job name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     * 
     */
    @Import(name="ingestionName", required=true)
    private Output<String> ingestionName;

    /**
     * @return Ingestion job name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     * 
     */
    public Output<String> ingestionName() {
        return this.ingestionName;
    }

    /**
     * Task execution interval, support minute `m`, hour `h`, day `d`, for example 30 minutes `30m`.
     * 
     */
    @Import(name="interval", required=true)
    private Output<String> interval;

    /**
     * @return Task execution interval, support minute `m`, hour `h`, day `d`, for example 30 minutes `30m`.
     * 
     */
    public Output<String> interval() {
        return this.interval;
    }

    /**
     * The name of the target logstore.
     * 
     */
    @Import(name="logstore", required=true)
    private Output<String> logstore;

    /**
     * @return The name of the target logstore.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }

    /**
     * The name of the log project. It is the only in one Alicloud account.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The name of the log project. It is the only in one Alicloud account.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * Whether to run the ingestion job immediately, if false, wait for an interval before starting the ingestion.
     * 
     */
    @Import(name="runImmediately", required=true)
    private Output<Boolean> runImmediately;

    /**
     * @return Whether to run the ingestion job immediately, if false, wait for an interval before starting the ingestion.
     * 
     */
    public Output<Boolean> runImmediately() {
        return this.runImmediately;
    }

    /**
     * Data source and data format details. [Refer to details](https://www.alibabacloud.com/help/en/doc-detail/147819.html).
     * 
     */
    @Import(name="source", required=true)
    private Output<String> source;

    /**
     * @return Data source and data format details. [Refer to details](https://www.alibabacloud.com/help/en/doc-detail/147819.html).
     * 
     */
    public Output<String> source() {
        return this.source;
    }

    /**
     * Which time zone is the log time imported in, e.g. `+0800`.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Which time zone is the log time imported in, e.g. `+0800`.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private IngestionArgs() {}

    private IngestionArgs(IngestionArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.ingestionName = $.ingestionName;
        this.interval = $.interval;
        this.logstore = $.logstore;
        this.project = $.project;
        this.runImmediately = $.runImmediately;
        this.source = $.source;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngestionArgs $;

        public Builder() {
            $ = new IngestionArgs();
        }

        public Builder(IngestionArgs defaults) {
            $ = new IngestionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Ingestion job description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Ingestion job description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name displayed on the web page.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name displayed on the web page.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param ingestionName Ingestion job name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
         * 
         * @return builder
         * 
         */
        public Builder ingestionName(Output<String> ingestionName) {
            $.ingestionName = ingestionName;
            return this;
        }

        /**
         * @param ingestionName Ingestion job name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
         * 
         * @return builder
         * 
         */
        public Builder ingestionName(String ingestionName) {
            return ingestionName(Output.of(ingestionName));
        }

        /**
         * @param interval Task execution interval, support minute `m`, hour `h`, day `d`, for example 30 minutes `30m`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Task execution interval, support minute `m`, hour `h`, day `d`, for example 30 minutes `30m`.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param logstore The name of the target logstore.
         * 
         * @return builder
         * 
         */
        public Builder logstore(Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore The name of the target logstore.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param project The name of the log project. It is the only in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the log project. It is the only in one Alicloud account.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param runImmediately Whether to run the ingestion job immediately, if false, wait for an interval before starting the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder runImmediately(Output<Boolean> runImmediately) {
            $.runImmediately = runImmediately;
            return this;
        }

        /**
         * @param runImmediately Whether to run the ingestion job immediately, if false, wait for an interval before starting the ingestion.
         * 
         * @return builder
         * 
         */
        public Builder runImmediately(Boolean runImmediately) {
            return runImmediately(Output.of(runImmediately));
        }

        /**
         * @param source Data source and data format details. [Refer to details](https://www.alibabacloud.com/help/en/doc-detail/147819.html).
         * 
         * @return builder
         * 
         */
        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Data source and data format details. [Refer to details](https://www.alibabacloud.com/help/en/doc-detail/147819.html).
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param timeZone Which time zone is the log time imported in, e.g. `+0800`.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Which time zone is the log time imported in, e.g. `+0800`.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public IngestionArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.ingestionName = Objects.requireNonNull($.ingestionName, "expected parameter 'ingestionName' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.logstore = Objects.requireNonNull($.logstore, "expected parameter 'logstore' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.runImmediately = Objects.requireNonNull($.runImmediately, "expected parameter 'runImmediately' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
