// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Log service data delivery management, this service provides the function of delivering data in logstore to oss product storage.
 * [Refer to details](https://www.alibabacloud.com/help/en/log-service/latest/ship-logs-to-oss-new-version).
 *
 * > **NOTE:** Available in 1.187.0+
 *
 * ## Import
 *
 * Log oss export can be imported using the id or name, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:log/ossExport:OssExport example tf-log-project:tf-log-logstore:tf-log-export
 * ```
 */
export class OssExport extends pulumi.CustomResource {
    /**
     * Get an existing OssExport resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OssExportState, opts?: pulumi.CustomResourceOptions): OssExport {
        return new OssExport(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:log/ossExport:OssExport';

    /**
     * Returns true if the given object is an instance of OssExport.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OssExport {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OssExport.__pulumiType;
    }

    /**
     * The name of the oss bucket.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * How often is it delivered every interval.
     */
    public readonly bufferInterval!: pulumi.Output<number>;
    /**
     * Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
     */
    public readonly bufferSize!: pulumi.Output<number>;
    /**
     * OSS data storage compression method, support: `none`, `snappy`, `zstd`, `gzip`. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
     */
    public readonly compressType!: pulumi.Output<string>;
    /**
     * Configure columns when `contentType` is `parquet` or `orc`.
     */
    public readonly configColumns!: pulumi.Output<outputs.log.OssExportConfigColumn[] | undefined>;
    /**
     * Storage format, only supports three types: `json`, `parquet`, `orc`, `csv`.
     * **According to the different format, please select the following parameters**
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * Field configuration in csv content_type.
     */
    public readonly csvConfigColumns!: pulumi.Output<string[] | undefined>;
    /**
     * Separator configuration in csv content_type.
     */
    public readonly csvConfigDelimiter!: pulumi.Output<string | undefined>;
    /**
     * escape in csv content_type.
     */
    public readonly csvConfigEscape!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether to write the field name to the CSV file, the default value is `false`.
     */
    public readonly csvConfigHeader!: pulumi.Output<boolean | undefined>;
    /**
     * lineFeed in csv content_type.
     */
    public readonly csvConfigLinefeed!: pulumi.Output<string | undefined>;
    /**
     * Invalid field content in csv content_type.
     */
    public readonly csvConfigNull!: pulumi.Output<string | undefined>;
    /**
     * Escape character in csv content_type.
     */
    public readonly csvConfigQuote!: pulumi.Output<string | undefined>;
    /**
     * The display name for oss export.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     */
    public readonly exportName!: pulumi.Output<string>;
    /**
     * The log from when to export to oss.
     */
    public readonly fromTime!: pulumi.Output<number | undefined>;
    /**
     * Whether to deliver the label when `contentType` = `json`.
     */
    public readonly jsonEnableTag!: pulumi.Output<boolean | undefined>;
    /**
     * Used for logstore reading, the role should have log read policy, such as `acs:ram::13234:role/logrole`, if `logReadRoleArn` is not set, `roleArn` is used to read logstore.
     */
    public readonly logReadRoleArn!: pulumi.Output<string | undefined>;
    /**
     * The name of the log logstore.
     */
    public readonly logstoreName!: pulumi.Output<string>;
    /**
     * The OSS Bucket directory is dynamically generated according to the creation time of the export task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
     */
    public readonly pathFormat!: pulumi.Output<string>;
    /**
     * The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
     */
    public readonly prefix!: pulumi.Output<string | undefined>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    public readonly projectName!: pulumi.Output<string>;
    /**
     * Used to write to oss bucket, the OSS Bucket owner creates the role mark which has the oss bucket write policy, such as `acs:ram::13234:role/logrole`.
     */
    public readonly roleArn!: pulumi.Output<string | undefined>;
    /**
     * The suffix for the objects in which the shipped data is stored.
     */
    public readonly suffix!: pulumi.Output<string | undefined>;
    /**
     * This time zone that is used to format the time, `+0800` e.g.
     */
    public readonly timeZone!: pulumi.Output<string>;

    /**
     * Create a OssExport resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OssExportArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OssExportArgs | OssExportState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OssExportState | undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["bufferInterval"] = state ? state.bufferInterval : undefined;
            resourceInputs["bufferSize"] = state ? state.bufferSize : undefined;
            resourceInputs["compressType"] = state ? state.compressType : undefined;
            resourceInputs["configColumns"] = state ? state.configColumns : undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["csvConfigColumns"] = state ? state.csvConfigColumns : undefined;
            resourceInputs["csvConfigDelimiter"] = state ? state.csvConfigDelimiter : undefined;
            resourceInputs["csvConfigEscape"] = state ? state.csvConfigEscape : undefined;
            resourceInputs["csvConfigHeader"] = state ? state.csvConfigHeader : undefined;
            resourceInputs["csvConfigLinefeed"] = state ? state.csvConfigLinefeed : undefined;
            resourceInputs["csvConfigNull"] = state ? state.csvConfigNull : undefined;
            resourceInputs["csvConfigQuote"] = state ? state.csvConfigQuote : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["exportName"] = state ? state.exportName : undefined;
            resourceInputs["fromTime"] = state ? state.fromTime : undefined;
            resourceInputs["jsonEnableTag"] = state ? state.jsonEnableTag : undefined;
            resourceInputs["logReadRoleArn"] = state ? state.logReadRoleArn : undefined;
            resourceInputs["logstoreName"] = state ? state.logstoreName : undefined;
            resourceInputs["pathFormat"] = state ? state.pathFormat : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["projectName"] = state ? state.projectName : undefined;
            resourceInputs["roleArn"] = state ? state.roleArn : undefined;
            resourceInputs["suffix"] = state ? state.suffix : undefined;
            resourceInputs["timeZone"] = state ? state.timeZone : undefined;
        } else {
            const args = argsOrState as OssExportArgs | undefined;
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.bufferInterval === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bufferInterval'");
            }
            if ((!args || args.bufferSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bufferSize'");
            }
            if ((!args || args.contentType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'contentType'");
            }
            if ((!args || args.exportName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'exportName'");
            }
            if ((!args || args.logstoreName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logstoreName'");
            }
            if ((!args || args.pathFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pathFormat'");
            }
            if ((!args || args.projectName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectName'");
            }
            if ((!args || args.timeZone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'timeZone'");
            }
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["bufferInterval"] = args ? args.bufferInterval : undefined;
            resourceInputs["bufferSize"] = args ? args.bufferSize : undefined;
            resourceInputs["compressType"] = args ? args.compressType : undefined;
            resourceInputs["configColumns"] = args ? args.configColumns : undefined;
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["csvConfigColumns"] = args ? args.csvConfigColumns : undefined;
            resourceInputs["csvConfigDelimiter"] = args ? args.csvConfigDelimiter : undefined;
            resourceInputs["csvConfigEscape"] = args ? args.csvConfigEscape : undefined;
            resourceInputs["csvConfigHeader"] = args ? args.csvConfigHeader : undefined;
            resourceInputs["csvConfigLinefeed"] = args ? args.csvConfigLinefeed : undefined;
            resourceInputs["csvConfigNull"] = args ? args.csvConfigNull : undefined;
            resourceInputs["csvConfigQuote"] = args ? args.csvConfigQuote : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["exportName"] = args ? args.exportName : undefined;
            resourceInputs["fromTime"] = args ? args.fromTime : undefined;
            resourceInputs["jsonEnableTag"] = args ? args.jsonEnableTag : undefined;
            resourceInputs["logReadRoleArn"] = args ? args.logReadRoleArn : undefined;
            resourceInputs["logstoreName"] = args ? args.logstoreName : undefined;
            resourceInputs["pathFormat"] = args ? args.pathFormat : undefined;
            resourceInputs["prefix"] = args ? args.prefix : undefined;
            resourceInputs["projectName"] = args ? args.projectName : undefined;
            resourceInputs["roleArn"] = args ? args.roleArn : undefined;
            resourceInputs["suffix"] = args ? args.suffix : undefined;
            resourceInputs["timeZone"] = args ? args.timeZone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OssExport.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OssExport resources.
 */
export interface OssExportState {
    /**
     * The name of the oss bucket.
     */
    bucket?: pulumi.Input<string>;
    /**
     * How often is it delivered every interval.
     */
    bufferInterval?: pulumi.Input<number>;
    /**
     * Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
     */
    bufferSize?: pulumi.Input<number>;
    /**
     * OSS data storage compression method, support: `none`, `snappy`, `zstd`, `gzip`. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
     */
    compressType?: pulumi.Input<string>;
    /**
     * Configure columns when `contentType` is `parquet` or `orc`.
     */
    configColumns?: pulumi.Input<pulumi.Input<inputs.log.OssExportConfigColumn>[]>;
    /**
     * Storage format, only supports three types: `json`, `parquet`, `orc`, `csv`.
     * **According to the different format, please select the following parameters**
     */
    contentType?: pulumi.Input<string>;
    /**
     * Field configuration in csv content_type.
     */
    csvConfigColumns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Separator configuration in csv content_type.
     */
    csvConfigDelimiter?: pulumi.Input<string>;
    /**
     * escape in csv content_type.
     */
    csvConfigEscape?: pulumi.Input<string>;
    /**
     * Indicates whether to write the field name to the CSV file, the default value is `false`.
     */
    csvConfigHeader?: pulumi.Input<boolean>;
    /**
     * lineFeed in csv content_type.
     */
    csvConfigLinefeed?: pulumi.Input<string>;
    /**
     * Invalid field content in csv content_type.
     */
    csvConfigNull?: pulumi.Input<string>;
    /**
     * Escape character in csv content_type.
     */
    csvConfigQuote?: pulumi.Input<string>;
    /**
     * The display name for oss export.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     */
    exportName?: pulumi.Input<string>;
    /**
     * The log from when to export to oss.
     */
    fromTime?: pulumi.Input<number>;
    /**
     * Whether to deliver the label when `contentType` = `json`.
     */
    jsonEnableTag?: pulumi.Input<boolean>;
    /**
     * Used for logstore reading, the role should have log read policy, such as `acs:ram::13234:role/logrole`, if `logReadRoleArn` is not set, `roleArn` is used to read logstore.
     */
    logReadRoleArn?: pulumi.Input<string>;
    /**
     * The name of the log logstore.
     */
    logstoreName?: pulumi.Input<string>;
    /**
     * The OSS Bucket directory is dynamically generated according to the creation time of the export task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
     */
    pathFormat?: pulumi.Input<string>;
    /**
     * The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
     */
    prefix?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    projectName?: pulumi.Input<string>;
    /**
     * Used to write to oss bucket, the OSS Bucket owner creates the role mark which has the oss bucket write policy, such as `acs:ram::13234:role/logrole`.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * The suffix for the objects in which the shipped data is stored.
     */
    suffix?: pulumi.Input<string>;
    /**
     * This time zone that is used to format the time, `+0800` e.g.
     */
    timeZone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OssExport resource.
 */
export interface OssExportArgs {
    /**
     * The name of the oss bucket.
     */
    bucket: pulumi.Input<string>;
    /**
     * How often is it delivered every interval.
     */
    bufferInterval: pulumi.Input<number>;
    /**
     * Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
     */
    bufferSize: pulumi.Input<number>;
    /**
     * OSS data storage compression method, support: `none`, `snappy`, `zstd`, `gzip`. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
     */
    compressType?: pulumi.Input<string>;
    /**
     * Configure columns when `contentType` is `parquet` or `orc`.
     */
    configColumns?: pulumi.Input<pulumi.Input<inputs.log.OssExportConfigColumn>[]>;
    /**
     * Storage format, only supports three types: `json`, `parquet`, `orc`, `csv`.
     * **According to the different format, please select the following parameters**
     */
    contentType: pulumi.Input<string>;
    /**
     * Field configuration in csv content_type.
     */
    csvConfigColumns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Separator configuration in csv content_type.
     */
    csvConfigDelimiter?: pulumi.Input<string>;
    /**
     * escape in csv content_type.
     */
    csvConfigEscape?: pulumi.Input<string>;
    /**
     * Indicates whether to write the field name to the CSV file, the default value is `false`.
     */
    csvConfigHeader?: pulumi.Input<boolean>;
    /**
     * lineFeed in csv content_type.
     */
    csvConfigLinefeed?: pulumi.Input<string>;
    /**
     * Invalid field content in csv content_type.
     */
    csvConfigNull?: pulumi.Input<string>;
    /**
     * Escape character in csv content_type.
     */
    csvConfigQuote?: pulumi.Input<string>;
    /**
     * The display name for oss export.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     */
    exportName: pulumi.Input<string>;
    /**
     * The log from when to export to oss.
     */
    fromTime?: pulumi.Input<number>;
    /**
     * Whether to deliver the label when `contentType` = `json`.
     */
    jsonEnableTag?: pulumi.Input<boolean>;
    /**
     * Used for logstore reading, the role should have log read policy, such as `acs:ram::13234:role/logrole`, if `logReadRoleArn` is not set, `roleArn` is used to read logstore.
     */
    logReadRoleArn?: pulumi.Input<string>;
    /**
     * The name of the log logstore.
     */
    logstoreName: pulumi.Input<string>;
    /**
     * The OSS Bucket directory is dynamically generated according to the creation time of the export task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
     */
    pathFormat: pulumi.Input<string>;
    /**
     * The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
     */
    prefix?: pulumi.Input<string>;
    /**
     * The name of the log project. It is the only in one Alicloud account.
     */
    projectName: pulumi.Input<string>;
    /**
     * Used to write to oss bucket, the OSS Bucket owner creates the role mark which has the oss bucket write policy, such as `acs:ram::13234:role/logrole`.
     */
    roleArn?: pulumi.Input<string>;
    /**
     * The suffix for the objects in which the shipped data is stored.
     */
    suffix?: pulumi.Input<string>;
    /**
     * This time zone that is used to format the time, `+0800` e.g.
     */
    timeZone: pulumi.Input<string>;
}
