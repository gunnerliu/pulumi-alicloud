// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A forwarding rule is configured in `HTTP`/`HTTPS` listener and it used to listen a list of backend servers which in one specified virtual backend server group.
 * You can add forwarding rules to a listener to forward requests based on the domain names or the URL in the request.
 * 
 * ~> **NOTE:** One virtual backend server group can be attached in multiple forwarding rules.
 * 
 * ~> **NOTE:** At least one "Domain" or "Url" must be specified when creating a new rule.
 * 
 * ~> **NOTE:** Having the same 'Domain' and 'Url' rule can not be created repeatedly in the one listener.
 * 
 * ~> **NOTE:** Rule only be created in the `HTTP` or `HTTPS` listener.
 * 
 * ~> **NOTE:** Only rule's virtual server group can be modified.
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleState): Rule {
        return new Rule(name, <any>state, { id });
    }

    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    public readonly domain: pulumi.Output<string | undefined>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    public readonly frontendPort: pulumi.Output<number>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    public readonly loadBalancerId: pulumi.Output<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    public readonly name: pulumi.Output<string>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    public readonly serverGroupId: pulumi.Output<string>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    public readonly url: pulumi.Output<string | undefined>;

    /**
     * Create a Rule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleArgs | RuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: RuleState = argsOrState as RuleState | undefined;
            inputs["domain"] = state ? state.domain : undefined;
            inputs["frontendPort"] = state ? state.frontendPort : undefined;
            inputs["loadBalancerId"] = state ? state.loadBalancerId : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["serverGroupId"] = state ? state.serverGroupId : undefined;
            inputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if (!args || args.frontendPort === undefined) {
                throw new Error("Missing required property 'frontendPort'");
            }
            if (!args || args.loadBalancerId === undefined) {
                throw new Error("Missing required property 'loadBalancerId'");
            }
            if (!args || args.serverGroupId === undefined) {
                throw new Error("Missing required property 'serverGroupId'");
            }
            inputs["domain"] = args ? args.domain : undefined;
            inputs["frontendPort"] = args ? args.frontendPort : undefined;
            inputs["loadBalancerId"] = args ? args.loadBalancerId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["serverGroupId"] = args ? args.serverGroupId : undefined;
            inputs["url"] = args ? args.url : undefined;
        }
        super("alicloud:slb/rule:Rule", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    readonly frontendPort?: pulumi.Input<number>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    readonly serverGroupId?: pulumi.Input<string>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    readonly url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * Domain name of the forwarding rule. It can contain letters a-z, numbers 0-9, hyphens (-), and periods (.),
     * and wildcard characters. The following two domain name formats are supported:
     * - Standard domain name: www.test.com
     * - Wildcard domain name: *.test.com. wildcard (*) must be the first character in the format of (*.)
     */
    readonly domain?: pulumi.Input<string>;
    /**
     * The listener frontend port which is used to launch the new forwarding rule. Valid range: [1-65535].
     */
    readonly frontendPort: pulumi.Input<number>;
    /**
     * The Load Balancer ID which is used to launch the new forwarding rule.
     */
    readonly loadBalancerId: pulumi.Input<string>;
    /**
     * Name of the forwarding rule. Our plugin provides a default name: "tf-slb-rule".
     */
    readonly name?: pulumi.Input<string>;
    /**
     * ID of a virtual server group that will be forwarded.
     */
    readonly serverGroupId: pulumi.Input<string>;
    /**
     * Domain of the forwarding rule. It must be 2-80 characters in length. Only letters a-z, numbers 0-9,
     * and characters '-' '/' '?' '%' '#' and '&' are allowed. URLs must be started with the character '/', but cannot be '/' alone.
     */
    readonly url?: pulumi.Input<string>;
}