// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Security Groups in an Alibaba Cloud account according to the specified filters.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "^web-"
// 		opt1 := "web_access.json"
// 		_, err := ecs.GetSecurityGroups(ctx, &ecs.GetSecurityGroupsArgs{
// 			NameRegex:  &opt0,
// 			OutputFile: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		primaryVpcDs, err := vpc.NewNetwork(ctx, "primaryVpcDs", nil)
// 		if err != nil {
// 			return err
// 		}
// 		primarySecGroupsDs := ecs.GetSecurityGroupsOutput(ctx, ecs.GetSecurityGroupsOutputArgs{
// 			VpcId: primaryVpcDs.ID(),
// 		}, nil)
// 		ctx.Export("firstGroupId", primarySecGroupsDs.ApplyT(func(primarySecGroupsDs ecs.GetSecurityGroupsResult) (string, error) {
// 			return primarySecGroupsDs.Groups[0].Id, nil
// 		}).(pulumi.StringOutput))
// 		return nil
// 	})
// }
// ```
func GetSecurityGroups(ctx *pulumi.Context, args *GetSecurityGroupsArgs, opts ...pulumi.InvokeOption) (*GetSecurityGroupsResult, error) {
	var rv GetSecurityGroupsResult
	err := ctx.Invoke("alicloud:ecs/getSecurityGroups:getSecurityGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityGroups.
type GetSecurityGroupsArgs struct {
	// A list of Security Group IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter the resulting security groups by their names.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// The Id of resource group which the securityGroup belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A map of tags assigned to the ECS instances. It must be in the format:
	// ```go
	// package main
	//
	// import (
	// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
	// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	// )
	//
	// func main() {
	// 	pulumi.Run(func(ctx *pulumi.Context) error {
	// 		_, err := ecs.GetSecurityGroups(ctx, &ecs.GetSecurityGroupsArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 				"tagKey2": "tagValue2",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags map[string]interface{} `pulumi:"tags"`
	// Used to retrieve security groups that belong to the specified VPC ID.
	VpcId *string `pulumi:"vpcId"`
}

// A collection of values returned by getSecurityGroups.
type GetSecurityGroupsResult struct {
	// A list of Security Groups. Each element contains the following attributes:
	Groups []GetSecurityGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Security Group IDs.
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Security Group names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// The Id of resource group which the securityGroup belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A map of tags assigned to the ECS instance.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the VPC that owns the security group.
	VpcId *string `pulumi:"vpcId"`
}

func GetSecurityGroupsOutput(ctx *pulumi.Context, args GetSecurityGroupsOutputArgs, opts ...pulumi.InvokeOption) GetSecurityGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSecurityGroupsResult, error) {
			args := v.(GetSecurityGroupsArgs)
			r, err := GetSecurityGroups(ctx, &args, opts...)
			return *r, err
		}).(GetSecurityGroupsResultOutput)
}

// A collection of arguments for invoking getSecurityGroups.
type GetSecurityGroupsOutputArgs struct {
	// A list of Security Group IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter the resulting security groups by their names.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The Id of resource group which the securityGroup belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// A map of tags assigned to the ECS instances. It must be in the format:
	// ```go
	// package main
	//
	// import (
	// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
	// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	// )
	//
	// func main() {
	// 	pulumi.Run(func(ctx *pulumi.Context) error {
	// 		_, err := ecs.GetSecurityGroups(ctx, &ecs.GetSecurityGroupsArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 				"tagKey2": "tagValue2",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags pulumi.MapInput `pulumi:"tags"`
	// Used to retrieve security groups that belong to the specified VPC ID.
	VpcId pulumi.StringPtrInput `pulumi:"vpcId"`
}

func (GetSecurityGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityGroups.
type GetSecurityGroupsResultOutput struct{ *pulumi.OutputState }

func (GetSecurityGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityGroupsResult)(nil)).Elem()
}

func (o GetSecurityGroupsResultOutput) ToGetSecurityGroupsResultOutput() GetSecurityGroupsResultOutput {
	return o
}

func (o GetSecurityGroupsResultOutput) ToGetSecurityGroupsResultOutputWithContext(ctx context.Context) GetSecurityGroupsResultOutput {
	return o
}

// A list of Security Groups. Each element contains the following attributes:
func (o GetSecurityGroupsResultOutput) Groups() GetSecurityGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []GetSecurityGroupsGroup { return v.Groups }).(GetSecurityGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecurityGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Security Group IDs.
func (o GetSecurityGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSecurityGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Security Group names.
func (o GetSecurityGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSecurityGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The Id of resource group which the securityGroup belongs.
func (o GetSecurityGroupsResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// A map of tags assigned to the ECS instance.
func (o GetSecurityGroupsResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

// The ID of the VPC that owns the security group.
func (o GetSecurityGroupsResultOutput) VpcId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityGroupsResult) *string { return v.VpcId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecurityGroupsResultOutput{})
}
