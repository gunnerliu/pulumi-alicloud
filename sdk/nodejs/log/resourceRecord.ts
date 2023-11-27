// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Log resource is a meta store service provided by log service, resource can be used to define meta store's table structure, record can be used for table's row data.
 *
 * For information about SLS Resource and how to use it, see [Resource management](https://www.alibabacloud.com/help/en/doc-detail/207732.html)
 *
 * > **NOTE:** Available since v1.162.0. log resource region should be set a main region: cn-heyuan.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleResource = new alicloud.log.Resource("exampleResource", {
 *     type: "userdefine",
 *     description: "user tf resource desc",
 *     extInfo: "{}",
 *     schema: `    {
 *       "schema": [
 *         {
 *           "column": "col1",
 *           "desc": "col1   desc",
 *           "ext_info": {
 *           },
 *           "required": true,
 *           "type": "string"
 *         },
 *         {
 *           "column": "col2",
 *           "desc": "col2   desc",
 *           "ext_info": "optional",
 *           "required": true,
 *           "type": "string"
 *         }
 *       ]
 *     }
 * `,
 * });
 * const exampleResourceRecord = new alicloud.log.ResourceRecord("exampleResourceRecord", {
 *     resourceName: exampleResource.id,
 *     recordId: "user_tf_resource_1",
 *     tag: "resource tag",
 *     value: `    {
 *       "col1": "this is col1 value",
 *       "col2": "col2   value"
 *     }
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * Log resource record can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:log/resourceRecord:ResourceRecord example <resource_name>:<record_id>
 * ```
 */
export class ResourceRecord extends pulumi.CustomResource {
    /**
     * Get an existing ResourceRecord resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceRecordState, opts?: pulumi.CustomResourceOptions): ResourceRecord {
        return new ResourceRecord(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:log/resourceRecord:ResourceRecord';

    /**
     * Returns true if the given object is an instance of ResourceRecord.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceRecord {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceRecord.__pulumiType;
    }

    /**
     * The record's id, should be unique.
     */
    public readonly recordId!: pulumi.Output<string>;
    /**
     * The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
     */
    public readonly resourceName!: pulumi.Output<string>;
    /**
     * The record's tag, can be used for search.
     */
    public readonly tag!: pulumi.Output<string>;
    /**
     * The json value of record.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a ResourceRecord resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceRecordArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceRecordArgs | ResourceRecordState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceRecordState | undefined;
            resourceInputs["recordId"] = state ? state.recordId : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
            resourceInputs["tag"] = state ? state.tag : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as ResourceRecordArgs | undefined;
            if ((!args || args.recordId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recordId'");
            }
            if ((!args || args.resourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceName'");
            }
            if ((!args || args.tag === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tag'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["recordId"] = args ? args.recordId : undefined;
            resourceInputs["resourceName"] = args ? args.resourceName : undefined;
            resourceInputs["tag"] = args ? args.tag : undefined;
            resourceInputs["value"] = args ? args.value : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceRecord.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceRecord resources.
 */
export interface ResourceRecordState {
    /**
     * The record's id, should be unique.
     */
    recordId?: pulumi.Input<string>;
    /**
     * The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
     */
    resourceName?: pulumi.Input<string>;
    /**
     * The record's tag, can be used for search.
     */
    tag?: pulumi.Input<string>;
    /**
     * The json value of record.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceRecord resource.
 */
export interface ResourceRecordArgs {
    /**
     * The record's id, should be unique.
     */
    recordId: pulumi.Input<string>;
    /**
     * The name defined in log_resource, log service have some internal resource, like sls.common.user, sls.common.user_group.
     */
    resourceName: pulumi.Input<string>;
    /**
     * The record's tag, can be used for search.
     */
    tag: pulumi.Input<string>;
    /**
     * The json value of record.
     */
    value: pulumi.Input<string>;
}
