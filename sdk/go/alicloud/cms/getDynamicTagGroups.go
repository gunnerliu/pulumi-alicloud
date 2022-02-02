// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cms Dynamic Tag Groups of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.142.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "example_value"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		defaultAlarmContactGroup, err := cms.NewAlarmContactGroup(ctx, "defaultAlarmContactGroup", &cms.AlarmContactGroupArgs{
// 			AlarmContactGroupName: pulumi.String(name),
// 			Describe:              pulumi.String("example_value"),
// 			EnableSubscribed:      pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultDynamicTagGroup, err := cms.NewDynamicTagGroup(ctx, "defaultDynamicTagGroup", &cms.DynamicTagGroupArgs{
// 			ContactGroupLists: pulumi.StringArray{
// 				defaultAlarmContactGroup.ID(),
// 			},
// 			TagKey: pulumi.String("your_tag_key"),
// 			MatchExpresses: cms.DynamicTagGroupMatchExpressArray{
// 				&cms.DynamicTagGroupMatchExpressArgs{
// 					TagValue:              pulumi.String("your_tag_value"),
// 					TagValueMatchFunction: pulumi.String("all"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ids := cms.GetDynamicTagGroupsOutput(ctx, cms.GetDynamicTagGroupsOutputArgs{
// 			Ids: pulumi.StringArray{
// 				defaultDynamicTagGroup.ID(),
// 			},
// 		}, nil)
// 		ctx.Export("cmsDynamicTagGroupId1", ids.ApplyT(func(ids cms.GetDynamicTagGroupsResult) (string, error) {
// 			return ids.Groups[0].Id, nil
// 		}).(pulumi.StringOutput))
// 		return nil
// 	})
// }
// ```
func GetDynamicTagGroups(ctx *pulumi.Context, args *GetDynamicTagGroupsArgs, opts ...pulumi.InvokeOption) (*GetDynamicTagGroupsResult, error) {
	var rv GetDynamicTagGroupsResult
	err := ctx.Invoke("alicloud:cms/getDynamicTagGroups:getDynamicTagGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDynamicTagGroups.
type GetDynamicTagGroupsArgs struct {
	// A list of Dynamic Tag Group IDs.
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the resource. Valid values: `RUNNING`, `FINISH`.
	Status *string `pulumi:"status"`
	// The tag key of the tag.
	TagKey *string `pulumi:"tagKey"`
}

// A collection of values returned by getDynamicTagGroups.
type GetDynamicTagGroupsResult struct {
	Groups []GetDynamicTagGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	Status     *string  `pulumi:"status"`
	TagKey     *string  `pulumi:"tagKey"`
}

func GetDynamicTagGroupsOutput(ctx *pulumi.Context, args GetDynamicTagGroupsOutputArgs, opts ...pulumi.InvokeOption) GetDynamicTagGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDynamicTagGroupsResult, error) {
			args := v.(GetDynamicTagGroupsArgs)
			r, err := GetDynamicTagGroups(ctx, &args, opts...)
			return *r, err
		}).(GetDynamicTagGroupsResultOutput)
}

// A collection of arguments for invoking getDynamicTagGroups.
type GetDynamicTagGroupsOutputArgs struct {
	// A list of Dynamic Tag Group IDs.
	Ids        pulumi.StringArrayInput `pulumi:"ids"`
	OutputFile pulumi.StringPtrInput   `pulumi:"outputFile"`
	// The status of the resource. Valid values: `RUNNING`, `FINISH`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The tag key of the tag.
	TagKey pulumi.StringPtrInput `pulumi:"tagKey"`
}

func (GetDynamicTagGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicTagGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getDynamicTagGroups.
type GetDynamicTagGroupsResultOutput struct{ *pulumi.OutputState }

func (GetDynamicTagGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicTagGroupsResult)(nil)).Elem()
}

func (o GetDynamicTagGroupsResultOutput) ToGetDynamicTagGroupsResultOutput() GetDynamicTagGroupsResultOutput {
	return o
}

func (o GetDynamicTagGroupsResultOutput) ToGetDynamicTagGroupsResultOutputWithContext(ctx context.Context) GetDynamicTagGroupsResultOutput {
	return o
}

func (o GetDynamicTagGroupsResultOutput) Groups() GetDynamicTagGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) []GetDynamicTagGroupsGroup { return v.Groups }).(GetDynamicTagGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDynamicTagGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDynamicTagGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDynamicTagGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDynamicTagGroupsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetDynamicTagGroupsResultOutput) TagKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicTagGroupsResult) *string { return v.TagKey }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDynamicTagGroupsResultOutput{})
}
