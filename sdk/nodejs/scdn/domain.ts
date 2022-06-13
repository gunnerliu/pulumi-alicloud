// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a SCDN Domain resource.
 *
 * For information about SCDN Domain and how to use it, see [What is Domain](https://help.aliyun.com/document_detail/63672.html).
 *
 * > **NOTE:** Available in v1.131.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = new alicloud.scdn.Domain("example", {
 *     domainName: "my-Domain",
 *     sources: [{
 *         content: "xxx.aliyuncs.com",
 *         enabled: "online",
 *         port: 80,
 *         priority: "20",
 *         type: "oss",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * SCDN Domain can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:scdn/domain:Domain example <domain_name>
 * ```
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:scdn/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * Attribute perm has been deprecated and suggest removing it from your template.
     *
     * @deprecated Attribute biz_name has been deprecated and suggest removing it from your template.
     */
    public readonly bizName!: pulumi.Output<string | undefined>;
    /**
     * Certificate Information. See the following `Block certInfos`.
     */
    public readonly certInfos!: pulumi.Output<outputs.scdn.DomainCertInfo[] | undefined>;
    /**
     * The health check url.
     */
    public readonly checkUrl!: pulumi.Output<string | undefined>;
    /**
     * The name of domain.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * Whether to set certificate forcibly.
     */
    public readonly forceSet!: pulumi.Output<string | undefined>;
    /**
     * The resource group id.
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * the Origin Server Information. See the following `Block sources`.
     */
    public readonly sources!: pulumi.Output<outputs.scdn.DomainSource[]>;
    /**
     * The status of the resource. Valid values: `offline`, `online`.
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["bizName"] = state ? state.bizName : undefined;
            resourceInputs["certInfos"] = state ? state.certInfos : undefined;
            resourceInputs["checkUrl"] = state ? state.checkUrl : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["forceSet"] = state ? state.forceSet : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["sources"] = state ? state.sources : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.sources === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sources'");
            }
            resourceInputs["bizName"] = args ? args.bizName : undefined;
            resourceInputs["certInfos"] = args ? args.certInfos : undefined;
            resourceInputs["checkUrl"] = args ? args.checkUrl : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["forceSet"] = args ? args.forceSet : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["sources"] = args ? args.sources : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * Attribute perm has been deprecated and suggest removing it from your template.
     *
     * @deprecated Attribute biz_name has been deprecated and suggest removing it from your template.
     */
    bizName?: pulumi.Input<string>;
    /**
     * Certificate Information. See the following `Block certInfos`.
     */
    certInfos?: pulumi.Input<pulumi.Input<inputs.scdn.DomainCertInfo>[]>;
    /**
     * The health check url.
     */
    checkUrl?: pulumi.Input<string>;
    /**
     * The name of domain.
     */
    domainName?: pulumi.Input<string>;
    /**
     * Whether to set certificate forcibly.
     */
    forceSet?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * the Origin Server Information. See the following `Block sources`.
     */
    sources?: pulumi.Input<pulumi.Input<inputs.scdn.DomainSource>[]>;
    /**
     * The status of the resource. Valid values: `offline`, `online`.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Attribute perm has been deprecated and suggest removing it from your template.
     *
     * @deprecated Attribute biz_name has been deprecated and suggest removing it from your template.
     */
    bizName?: pulumi.Input<string>;
    /**
     * Certificate Information. See the following `Block certInfos`.
     */
    certInfos?: pulumi.Input<pulumi.Input<inputs.scdn.DomainCertInfo>[]>;
    /**
     * The health check url.
     */
    checkUrl?: pulumi.Input<string>;
    /**
     * The name of domain.
     */
    domainName: pulumi.Input<string>;
    /**
     * Whether to set certificate forcibly.
     */
    forceSet?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * the Origin Server Information. See the following `Block sources`.
     */
    sources: pulumi.Input<pulumi.Input<inputs.scdn.DomainSource>[]>;
    /**
     * The status of the resource. Valid values: `offline`, `online`.
     */
    status?: pulumi.Input<string>;
}
