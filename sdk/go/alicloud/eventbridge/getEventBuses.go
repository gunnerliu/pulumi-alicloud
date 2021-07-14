// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetEventBuses(ctx *pulumi.Context, args *GetEventBusesArgs, opts ...pulumi.InvokeOption) (*GetEventBusesResult, error) {
	var rv GetEventBusesResult
	err := ctx.Invoke("alicloud:eventbridge/getEventBuses:getEventBuses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventBuses.
type GetEventBusesArgs struct {
	EventBusType *string  `pulumi:"eventBusType"`
	Ids          []string `pulumi:"ids"`
	NamePrefix   *string  `pulumi:"namePrefix"`
	NameRegex    *string  `pulumi:"nameRegex"`
	OutputFile   *string  `pulumi:"outputFile"`
}

// A collection of values returned by getEventBuses.
type GetEventBusesResult struct {
	Buses        []GetEventBusesBus `pulumi:"buses"`
	EventBusType *string            `pulumi:"eventBusType"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	NamePrefix *string  `pulumi:"namePrefix"`
	NameRegex  *string  `pulumi:"nameRegex"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}
